package com.democritoz.solidity_web3j_maven.contract;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 1.4.2.
 */
@SuppressWarnings("rawtypes")
public class Test001 extends Contract {
    public static final String BINARY = "0x608060405234801561001057600080fd5b506108f7806100206000396000f3fe608060405234801561001057600080fd5b506004361061007d5760003560e01c80634aa0d4701161005b5780634aa0d470146100dc578063967e6e65146100f8578063c47f002714610116578063d5dcf127146101325761007d565b806306fdde031461008257806317d7de7c146100a0578063262a9dff146100be575b600080fd5b61008a61014e565b6040516100979190610346565b60405180910390f35b6100a86101dc565b6040516100b59190610346565b60405180910390f35b6100c661026e565b6040516100d39190610381565b60405180910390f35b6100f660048036038101906100f19190610511565b610274565b005b61010061028f565b60405161010d9190610381565b60405180910390f35b610130600480360381019061012b919061056d565b610299565b005b61014c600480360381019061014791906105b6565b6102ac565b005b6000805461015b90610612565b80601f016020809104026020016040519081016040528092919081815260200182805461018790610612565b80156101d45780601f106101a9576101008083540402835291602001916101d4565b820191906000526020600020905b8154815290600101906020018083116101b757829003601f168201915b505050505081565b6060600080546101eb90610612565b80601f016020809104026020016040519081016040528092919081815260200182805461021790610612565b80156102645780601f1061023957610100808354040283529160200191610264565b820191906000526020600020905b81548152906001019060200180831161024757829003601f168201915b5050505050905090565b60015481565b816000908161028391906107ef565b50806001819055505050565b6000600154905090565b80600090816102a891906107ef565b5050565b8060018190555050565b600081519050919050565b600082825260208201905092915050565b60005b838110156102f05780820151818401526020810190506102d5565b60008484015250505050565b6000601f19601f8301169050919050565b6000610318826102b6565b61032281856102c1565b93506103328185602086016102d2565b61033b816102fc565b840191505092915050565b60006020820190508181036000830152610360818461030d565b905092915050565b6000819050919050565b61037b81610368565b82525050565b60006020820190506103966000830184610372565b92915050565b6000604051905090565b600080fd5b600080fd5b600080fd5b600080fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6103f2826102fc565b810181811067ffffffffffffffff82111715610411576104106103ba565b5b80604052505050565b600061042461039c565b905061043082826103e9565b919050565b600067ffffffffffffffff8211156104505761044f6103ba565b5b610459826102fc565b9050602081019050919050565b82818337600083830152505050565b600061048861048384610435565b61041a565b9050828152602081018484840111156104a4576104a36103b5565b5b6104af848285610466565b509392505050565b600082601f8301126104cc576104cb6103b0565b5b81356104dc848260208601610475565b91505092915050565b6104ee81610368565b81146104f957600080fd5b50565b60008135905061050b816104e5565b92915050565b60008060408385031215610528576105276103a6565b5b600083013567ffffffffffffffff811115610546576105456103ab565b5b610552858286016104b7565b9250506020610563858286016104fc565b9150509250929050565b600060208284031215610583576105826103a6565b5b600082013567ffffffffffffffff8111156105a1576105a06103ab565b5b6105ad848285016104b7565b91505092915050565b6000602082840312156105cc576105cb6103a6565b5b60006105da848285016104fc565b91505092915050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b6000600282049050600182168061062a57607f821691505b60208210810361063d5761063c6105e3565b5b50919050565b60008190508160005260206000209050919050565b60006020601f8301049050919050565b600082821b905092915050565b6000600883026106a57fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff82610668565b6106af8683610668565b95508019841693508086168417925050509392505050565b6000819050919050565b60006106ec6106e76106e284610368565b6106c7565b610368565b9050919050565b6000819050919050565b610706836106d1565b61071a610712826106f3565b848454610675565b825550505050565b600090565b61072f610722565b61073a8184846106fd565b505050565b5b8181101561075e57610753600082610727565b600181019050610740565b5050565b601f8211156107a35761077481610643565b61077d84610658565b8101602085101561078c578190505b6107a061079885610658565b83018261073f565b50505b505050565b600082821c905092915050565b60006107c6600019846008026107a8565b1980831691505092915050565b60006107df83836107b5565b9150826002028217905092915050565b6107f8826102b6565b67ffffffffffffffff811115610811576108106103ba565b5b61081b8254610612565b610826828285610762565b600060209050601f8311600181146108595760008415610847578287015190505b61085185826107d3565b8655506108b9565b601f19841661086786610643565b60005b8281101561088f5784890151825560018201915060208501945060208101905061086a565b868310156108ac57848901516108a8601f8916826107b5565b8355505b6001600288020188555050505b50505050505056fea26469706673582212205b8b5979a9cdd141a7182bef328f7c9c6b72759d5b3b2be46f6907fb3a40089464736f6c63430008110033";

    public static final String FUNC_AGE = "age";

    public static final String FUNC_NAME = "name";

    public static final String FUNC_SETNAME = "setName";

    public static final String FUNC_SETAGE = "setAge";

    public static final String FUNC_GETNAME = "getName";

    public static final String FUNC_GETAGE = "getAge";

    public static final String FUNC_CHANGEALL = "changeAll";

    protected static final HashMap<String, String> _addresses;

    static {
        _addresses = new HashMap<String, String>();
    }

    @Deprecated
    protected Test001(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Test001(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Test001(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Test001(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<BigInteger> age() {
        final Function function = new Function(FUNC_AGE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<String> name() {
        final Function function = new Function(FUNC_NAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> setName(String _name) {
        final Function function = new Function(
                FUNC_SETNAME, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_name)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setAge(BigInteger _age) {
        final Function function = new Function(
                FUNC_SETAGE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_age)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> getName() {
        final Function function = new Function(FUNC_GETNAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<BigInteger> getAge() {
        final Function function = new Function(FUNC_GETAGE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> changeAll(String _name, BigInteger _age) {
        final Function function = new Function(
                FUNC_CHANGEALL, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_name), 
                new org.web3j.abi.datatypes.generated.Uint256(_age)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static Test001 load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Test001(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Test001 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Test001(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Test001 load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Test001(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Test001 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Test001(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Test001> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Test001.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Test001> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Test001.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Test001> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Test001.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Test001> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Test001.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    protected String getStaticDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static String getPreviouslyDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }
}
