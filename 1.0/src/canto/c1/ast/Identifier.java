﻿package canto.c1.ast;

import canto.CantoException;

/**
 * 标识符结点
 */
public class Identifier extends Access {

	/**
	 * 构造一个标识符
	 * @param name 标识符的名称
	 */
	public Identifier(String name, int line, int column) {
		super(name, line, column);
	}

	@Override
	public void accept(ASTVisitor visitor) throws CantoException {
		visitor.visit(this);
	}

	@Override
	public int getNodeType() {
		return IDENTIFIER;
	}

}
