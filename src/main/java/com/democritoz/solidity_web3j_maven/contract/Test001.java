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
    public static final String BINARY = "0x608060405234801561001057600080fd5b50610849806100206000396000f3fe608060405234801561001057600080fd5b50600436106100625760003560e01c806306fdde031461006757806317d7de7c14610085578063262a9dff146100a3578063967e6e65146100c1578063c47f0027146100df578063d5dcf127146100fb575b600080fd5b61006f610117565b60405161007c91906102f4565b60405180910390f35b61008d6101a5565b60405161009a91906102f4565b60405180910390f35b6100ab610237565b6040516100b8919061032f565b60405180910390f35b6100c961023d565b6040516100d6919061032f565b60405180910390f35b6100f960048036038101906100f49190610493565b610247565b005b61011560048036038101906101109190610508565b61025a565b005b6000805461012490610564565b80601f016020809104026020016040519081016040528092919081815260200182805461015090610564565b801561019d5780601f106101725761010080835404028352916020019161019d565b820191906000526020600020905b81548152906001019060200180831161018057829003601f168201915b505050505081565b6060600080546101b490610564565b80601f01602080910402602001604051908101604052809291908181526020018280546101e090610564565b801561022d5780601f106102025761010080835404028352916020019161022d565b820191906000526020600020905b81548152906001019060200180831161021057829003601f168201915b5050505050905090565b60015481565b6000600154905090565b80600090816102569190610741565b5050565b8060018190555050565b600081519050919050565b600082825260208201905092915050565b60005b8381101561029e578082015181840152602081019050610283565b60008484015250505050565b6000601f19601f8301169050919050565b60006102c682610264565b6102d0818561026f565b93506102e0818560208601610280565b6102e9816102aa565b840191505092915050565b6000602082019050818103600083015261030e81846102bb565b905092915050565b6000819050919050565b61032981610316565b82525050565b60006020820190506103446000830184610320565b92915050565b6000604051905090565b600080fd5b600080fd5b600080fd5b600080fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6103a0826102aa565b810181811067ffffffffffffffff821117156103bf576103be610368565b5b80604052505050565b60006103d261034a565b90506103de8282610397565b919050565b600067ffffffffffffffff8211156103fe576103fd610368565b5b610407826102aa565b9050602081019050919050565b82818337600083830152505050565b6000610436610431846103e3565b6103c8565b90508281526020810184848401111561045257610451610363565b5b61045d848285610414565b509392505050565b600082601f83011261047a5761047961035e565b5b813561048a848260208601610423565b91505092915050565b6000602082840312156104a9576104a8610354565b5b600082013567ffffffffffffffff8111156104c7576104c6610359565b5b6104d384828501610465565b91505092915050565b6104e581610316565b81146104f057600080fd5b50565b600081359050610502816104dc565b92915050565b60006020828403121561051e5761051d610354565b5b600061052c848285016104f3565b91505092915050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b6000600282049050600182168061057c57607f821691505b60208210810361058f5761058e610535565b5b50919050565b60008190508160005260206000209050919050565b60006020601f8301049050919050565b600082821b905092915050565b6000600883026105f77fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff826105ba565b61060186836105ba565b95508019841693508086168417925050509392505050565b6000819050919050565b600061063e61063961063484610316565b610619565b610316565b9050919050565b6000819050919050565b61065883610623565b61066c61066482610645565b8484546105c7565b825550505050565b600090565b610681610674565b61068c81848461064f565b505050565b5b818110156106b0576106a5600082610679565b600181019050610692565b5050565b601f8211156106f5576106c681610595565b6106cf846105aa565b810160208510156106de578190505b6106f26106ea856105aa565b830182610691565b50505b505050565b600082821c905092915050565b6000610718600019846008026106fa565b1980831691505092915050565b60006107318383610707565b9150826002028217905092915050565b61074a82610264565b67ffffffffffffffff81111561076357610762610368565b5b61076d8254610564565b6107788282856106b4565b600060209050601f8311600181146107ab5760008415610799578287015190505b6107a38582610725565b86555061080b565b601f1984166107b986610595565b60005b828110156107e1578489015182556001820191506020850194506020810190506107bc565b868310156107fe57848901516107fa601f891682610707565b8355505b6001600288020188555050505b50505050505056fea26469706673582212207ae5d04b88f4ecdbcc5f5633575b8e6a78eec306365344af89174cf2fd0aba1364736f6c63430008110033";

    public static final String FUNC_AGE = "age";

    public static final String FUNC_NAME = "name";

    public static final String FUNC_SETNAME = "setName";

    public static final String FUNC_SETAGE = "setAge";

    public static final String FUNC_GETNAME = "getName";

    public static final String FUNC_GETAGE = "getAge";

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
