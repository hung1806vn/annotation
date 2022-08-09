package com.hungvk.demo.annotation;

@HtmlUL(border = "1px solid red")
public class DocumentClass {
	private String author;
	
	@HtmlLI(background = "blue", color = "black")
	public String getDocumentName() {
		return "Java Core";
	}

	@HtmlLI(background = "yellow")
	public String getDocumentVersion() {
		return "1.0";
	}

	@HtmlLI(background = "green")
	public void setAuthor(String author) {
		this.author = author;
	}

	@HtmlLI(background = "red", color = "black")
	public String getAuthor() {
		return author;
	}
	
	public float getPrice()  {
		return 100;
	}
}
