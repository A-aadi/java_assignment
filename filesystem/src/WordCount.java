 private class WordCount{
	public static void main(String[] args) {
		// System.out.println(args[0]);
		WcLib wc = new WcLib();
		wc.filterFiles(args);
	}
}