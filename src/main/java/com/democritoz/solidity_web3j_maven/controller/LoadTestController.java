package com.democritoz.solidity_web3j_maven.controller;

import com.democritoz.solidity_web3j_maven.contract.Test001;
import com.democritoz.solidity_web3j_maven.contract.Test002;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.EthAccounts;
import org.web3j.protocol.core.methods.response.EthGetBalance;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.gas.DefaultGasProvider;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class LoadTestController {


    @GetMapping("/load/test001")
    public ResponseEntity<Map<String, Object>> test001() {

        Web3j web3j = Web3j.build(new HttpService("http://home.ziofront.com:19201"));

        Map<String, Object> responseMap = new HashMap<>();

        try {
            // private 키가... 하드코딩 되는데... 어케 숨길까?
            Credentials credentials = Credentials.create("0x3c3efec200b7c3ca8b8dc4f83f58666994c5659dedcf9b803339997b78e4f430");
            log.debug("credentials=[{}]", credentials);

            // ############ Test001 #############
            // application에서 contract를 deploy할때 마다 주소가 생성 되는데...
            // 이 contract deploy는 언제, 어떻게 해야 하나?
            // 기존의 contract는 어떻게 되나?
            // 기존의 contract 데이터와 연결점이 없겠지...?
            Test001 test001 = Test001.load("0xd924ae59c06569e6760045bab6b1d8865cb32ad4", web3j, credentials, new DefaultGasProvider());
            log.debug("test001=[{}]", test001);

            boolean isValid = test001.isValid();
            log.debug("isValid=[{}]", isValid);

            String name = null;
            if(isValid) {
                TransactionReceipt transactionReceipt = test001.setName("hello").send();
                log.debug("transactionReceipt=[{}]", transactionReceipt);
                log.debug("transactionReceipt.toString()=[{}]", transactionReceipt.toString());
                responseMap.put("transactionReceipt", transactionReceipt.toString());

                name = test001.getName().send();
            }

            log.debug("name=[{}]", name);


            responseMap.put("name", name);


            web3j.shutdown();

//            if(test001.isValid()) {
//                test001.setAge(BigInteger.valueOf(42)).send();
//            }
//
//            BigInteger age = test001.getAge().send();
//
//            log.debug("age=[{}]", age);


//            responseMap.put("ethAccounts", ethAccounts);
//            responseMap.put("credentials", credentials);
//            responseMap.put("test001", test001);
//            responseMap.put("age", age);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }


        return ResponseEntity.ok(responseMap);
    }


}
