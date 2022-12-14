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
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.gas.DefaultGasProvider;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class DeployTestController {


    @GetMapping("/deploy/test001")
    public ResponseEntity<Map<String, Object>> test001() {

        Web3j web3j = Web3j.build(new HttpService("http://home.ziofront.com:19201"));

        Map<String, Object> responseMap = new HashMap<>();

        try {
            // sendAsync와 send 비교하여, 응답 처리 방안을 좀더 확인 해봐야 할듯...
            // EthAccounts ethAccounts = web3j.ethAccounts().sendAsync().get();

            EthAccounts ethAccounts = web3j.ethAccounts().send();
            log.debug("ethAccounts=[{}]", ethAccounts);


            EthGetBalance ethGetBalance = web3j.ethGetBalance("0xb832db85527f4018a88cb4c32d805b15c458655f", DefaultBlockParameter.valueOf("latest")).send();
            log.debug("ethGetBalance=[{}]", ethGetBalance);


            Credentials credentials = Credentials.create("0x3c3efec200b7c3ca8b8dc4f83f58666994c5659dedcf9b803339997b78e4f430");
            log.debug("credentials=[{}]", credentials);

            // ############ Test001 #############
            // deploy를 그냥 막 계속 되네?
            // deploy할 때 마다, 새로운 contract 주소가 생성 된다.
            // deploy를 application에서 하는게 맞나? 언제 해야 하나?
            RemoteCall<Test001> deployedTest001 = Test001.deploy(web3j, credentials, new DefaultGasProvider());
            log.debug("deployedTest001=[{}]", deployedTest001);

            Test001 test001 = deployedTest001.send();
            log.debug("test001=[{}]", test001);

            responseMap.put("test001ContractAddress", test001.getContractAddress());
            

            boolean isValidTest001 = test001.isValid();
            log.debug("isValidTest001=[{}]", isValidTest001);

            test001.setName("Jiho").send();

            String name = test001.getName().send();
            log.debug("name=[{}]", name);


            // ############ Test002 #############
            RemoteCall<Test002> deployedTest002 = Test002.deploy(web3j, credentials, new DefaultGasProvider());
            log.debug("deployedTest002=[{}]", deployedTest002);

            Test002 test002 = deployedTest002.send();
            log.debug("test002=[{}]", test002);

            boolean isValidTest002 = test002.isValid();
            log.debug("isValidTest002=[{}]", isValidTest002);

            String homeAddress = test002.homeAddress().send();
            log.debug("homeAddress=[{}]", homeAddress);

            log.debug("test002.getContractAddress()=[{}]", test002.getContractAddress());

            web3j.shutdown();

            responseMap.put("ethAccounts", ethAccounts);
            responseMap.put("ethGetBalance", ethGetBalance);
            responseMap.put("credentials", credentials);

        } catch (Exception e) {

            log.error(e.getMessage(), e);
        }


        return ResponseEntity.ok(responseMap);
    }


}
