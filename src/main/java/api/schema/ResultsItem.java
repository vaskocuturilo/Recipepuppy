package api.schema;

public class ResultsItem{
	private String thumbnail;
	private String ingredients;
	private String href;
	private String title;

	public void setThumbnail(String thumbnail){
		this.thumbnail = thumbnail;
	}

	public String getThumbnail(){
		return thumbnail;
	}

	public void setIngredients(String ingredients){
		this.ingredients = ingredients;
	}

	public String getIngredients(){
		return ingredients;
	}

	public void setHref(String href){
		this.href = href;
	}

	public String getHref(){
		return href;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	@Override
 	public String toString(){
		return 
			"ResultsItem{" + 
			"thumbnail = '" + thumbnail + '\'' + 
			",ingredients = '" + ingredients + '\'' + 
			",href = '" + href + '\'' + 
			",title = '" + title + '\'' + 
			"}";
		}
}
