package com.democritoz.solidity_web3j_maven.controller;

import com.democritoz.solidity_web3j_maven.contract.MyConstants;
import com.democritoz.solidity_web3j_maven.contract.Test001;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.gas.DefaultGasProvider;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * ss
 */
@Slf4j
@RestController
public class LoadTestController {

    private Web3j web3j = Web3j.build(new HttpService(MyConstants.WEB3_NODE_URL));
    private Credentials credentials = Credentials.create(MyConstants.PRIVATE_KEY);
    private Test001 test001 = Test001.load(MyConstants.CONTRACT_ADDRESS, web3j, credentials, new DefaultGasProvider());

    @Data
    @Builder
    public static class TestDomain {
        private String name;
        private int age;
    }

    @PutMapping("/load/test001")
    public ResponseEntity<Map<String, Object>> putValue(@RequestBody TestDomain testDomain) {

        log.debug("testDomain=[{}]", testDomain);

        Map<String, Object> responseMap = new HashMap<>();

        try {
            // private 키가... 하드코딩 되는데... 어케 숨길까?

            // ############ Test001 #############
            // application에서 contract를 deploy할때 마다 주소가 생성 되는데...
            // 이 contract deploy는 언제, 어떻게 해야 하나?
            // 기존의 contract는 어떻게 되나?
            // 기존의 contract 데이터와 연결점이 없겠지...?

            boolean isValid = test001.isValid();
            log.debug("isValid=[{}]", isValid);

            String name = null;
            if (isValid) {
                // setName
                TransactionReceipt transactionReceipt1 = test001.setName(testDomain.getName()).send();
                log.debug("transactionReceipt1=[{}]", transactionReceipt1);
                log.debug("transactionReceipt1.toString()=[{}]", transactionReceipt1.toString());

                responseMap.put("transactionReceipt1", transactionReceipt1.toString());
                responseMap.put("usedGas1", transactionReceipt1.getGasUsed().intValue());

                // setAge
                TransactionReceipt transactionReceipt2 = test001.setAge(BigInteger.valueOf(testDomain.getAge())).send();
                log.debug("transactionReceipt2=[{}]", transactionReceipt2);
                log.debug("transactionReceipt2.toString()=[{}]", transactionReceipt2.toString());

                responseMap.put("transactionReceipt2", transactionReceipt2.toString());
                responseMap.put("usedGas2", transactionReceipt2.getGasUsed().intValue());

                // changeAll
                TransactionReceipt transactionReceipt3 = test001.changeAll(testDomain.getName(), BigInteger.valueOf(testDomain.getAge())).send();
                log.debug("transactionReceipt3=[{}]", transactionReceipt3);
                log.debug("transactionReceipt3.toString()=[{}]", transactionReceipt3.toString());

                responseMap.put("transactionReceipt3", transactionReceipt3.toString());
                responseMap.put("usedGas3", transactionReceipt3.getGasUsed().intValue());
            }

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

    @GetMapping("/load/test001")
    public ResponseEntity<Map<String, Object>> getValue() {

        Map<String, Object> responseMap = new HashMap<>();

        try {
            // private 키가... 하드코딩 되는데... 어케 숨길까?

            // ############ Test001 #############
            // application에서 contract를 deploy할때 마다 주소가 생성 되는데...
            // 이 contract deploy는 언제, 어떻게 해야 하나?
            // 기존의 contract는 어떻게 되나?
            // 기존의 contract 데이터와 연결점이 없겠지...?
            log.debug("test001=[{}]", test001);

            boolean isValid = test001.isValid();
            log.debug("isValid=[{}]", isValid);

            String name = null;
            BigInteger age = BigInteger.ZERO;
            if (isValid) {
                name = test001.getName().send();
                age = test001.getAge().send();
            }

            log.debug("name=[{}]", name);
            log.debug("age=[{}]", age);

            responseMap.put("name", name);
            responseMap.put("age", age);

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