public class PrintTextPerRole {
public static String printTextPerRole(String[] roles, String[] textLines) {
    StringBuilder textPerRole = new StringBuilder();
    for (String role : roles) {
        textPerRole.append("\n");
        textPerRole.append(role).append(":\n");
        for (int j = 0; j < textLines.length; j++) {
            if (textLines[j].startsWith(role.concat(":"))) {
                textPerRole.append(textLines[j].replace(role + ": ", j + 1 + ") ").replace("\n", "")).append("\n");
            }
        }
    }
    return textPerRole.toString();
}

}
