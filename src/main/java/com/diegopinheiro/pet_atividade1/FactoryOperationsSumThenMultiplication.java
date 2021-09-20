package com.diegopinheiro.pet_atividade1;

public class FactoryOperationsSumThenMultiplication extends FactoryOperations {
	@Override
	public Operation createBottomOperation() {
		Operation operation = new OperationSum();
		return operation;
	}
	
	@Override
	public Operation createTopOperation() {
		Operation topOperation = new OperationMultiplication();
		return topOperation;
	}
}
