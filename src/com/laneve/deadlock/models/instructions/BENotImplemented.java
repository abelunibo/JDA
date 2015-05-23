package com.laneve.deadlock.models.instructions;

import com.laneve.deadlock.models.BEInstructionLine;
import com.laneve.deadlock.models.Environment;
import com.laneve.deadlock.models.lam.LamBase;
import com.laneve.deadlock.models.lam.LamZT;

public class BENotImplemented extends BEInstructionLine implements BEInstruction{

	public BENotImplemented(String text) {
		instructionName = text;
	}

	@Override
	public LamBase generateLam(Environment environment) {
		
		LamBase lzt = new LamZT();		
		String lamZ = LamZT.getZhatBar(environment.getLocks());
		String lamT = LamZT.getThat(environment.getQueuethreads());	
		lzt.setLam(lamZ+" & "+lamT);
		changeEnvironment(environment);
		return lzt;
	}

	@Override
	public void changeEnvironment(Environment environment) {
		
	}



}
