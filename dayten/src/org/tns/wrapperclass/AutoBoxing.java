package org.tns.wrapperclass;
//Program to demonstrate on AutoBoxing
/*AutoBoxing: conversion of primitive datatype to object type*/
public class AutoBoxing {

	public static void main(String[] args) {
		int num = 97;
		//Converting a primitive data type to object 
		Integer value = num;
		System.out.println(value);
		
		System.out.println(value.getClass().getName());

	}

}
