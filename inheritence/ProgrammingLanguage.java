class ProgrammingLanguage{
	public void getLanguages (String[] languages){
		System.out.println("List of Languages");
		for(int programming=0;programming<languages.length;programming++){
			System.out.println("The programming languages available are:"+languages[programming]);
		}
	}
}