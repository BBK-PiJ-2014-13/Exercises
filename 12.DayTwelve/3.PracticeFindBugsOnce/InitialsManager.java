public class InitialsManager {
	public String getInitials(String fullName) {
		String result = "";
		String firstName = "";
		String secondName = "";
		boolean currentIsFirstName = true;
		for (int i = 0; i < fullName.length(); i++) {
			if (fullName.charAt(i) == ' ') {
				currentIsFirstName = false;
			} else {
				if (currentIsFirstName) {
					firstName += fullName.charAt(i);
				} else {
					secondName += fullName.charAt(i);
				}
			}
		}
		result += firstName.charAt(0);
		result += secondName.charAt(0);
		return result.toUpperCase();
	}
}
