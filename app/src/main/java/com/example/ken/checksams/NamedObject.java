package com.example.ken.checksams;

public class NamedObject<T> {
	  public final String name;
	  public final T object;

	  public NamedObject(String name, T object) {
	    this.name = name;
	    this.object = object;
	  }
}
