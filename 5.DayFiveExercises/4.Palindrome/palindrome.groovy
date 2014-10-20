boolean palindrome(String s) {
	int n = -1;
	if (n != s.length()) {
		n++;
		if (s.charAt(0+n) == s.charAt(s.length()-n-1)) {
			return true;
		} else {
			return false;
		}
	}
}

println(palindrome("olllllllllllo"));