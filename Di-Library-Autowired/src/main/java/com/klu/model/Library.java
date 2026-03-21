package com.klu.model;
import org.springframework.stereotype.Component;
import org.sprongframework.beans.factory.annotation.Autowired;
@Component
public class Library {
  private int libraryId;
  private String libraryName;
  private Book book;
  
  public Library() {
	  this.libraryId=1;
	  this.libraryName="KLU";
  }
  @Autowired
  public void setBook(Book book) {
	  this.book=book;
  }
  public void displayDetails() {
	  System.out.println("LibraryId:"+libraryId);
	  System.out.println("LibraryName:"+libraryName);
	  System.out.println("BookDetails:"+book);
  }
}
