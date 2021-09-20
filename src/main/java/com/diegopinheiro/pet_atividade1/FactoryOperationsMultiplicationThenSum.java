package com.diegopinheiro.pet_atividade1;

public class FactoryOperationsMultiplicationThenSum extends FactoryOperations {
	@Override
	public Operation createBottomOperation() {
		Operation bottomOperation = new OperationMultiplication();
		return bottomOperation;
	}
	
	@Override
	public Operation createTopOperation( ) {
		Operation topOperation = new OperationSum();
		return topOperation;
	}
}
