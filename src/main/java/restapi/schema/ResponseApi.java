package restapi.schema;

import java.util.List;

public class ResponseApi{
	private String href;
	private String title;
	private double version;
	private List<ResultsItem> results;

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

	public void setVersion(double version){
		this.version = version;
	}

	public double getVersion(){
		return version;
	}

	public void setResults(List<ResultsItem> results){
		this.results = results;
	}

	public List<ResultsItem> getResults(){
		return results;
	}

	@Override
 	public String toString(){
		return 
			"ResponseApi{" + 
			"href = '" + href + '\'' + 
			",title = '" + title + '\'' + 
			",version = '" + version + '\'' + 
			",results = '" + results + '\'' + 
			"}";
		}
}