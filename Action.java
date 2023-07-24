import java.util.Stack;

// Action class to represent each drawing action
class Action {
    private String type;
    private String[] parameters;

    public Action(String type, String... parameters) {
        this.type = type;
        this.parameters = parameters;
    }

    public String getType() {
        return type;
    }

    public String[] getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Action: ").append(type);
        if (parameters.length > 0) {
            sb.append(", Parameters: [");
            for (int i = 0; i < parameters.length; i++) {
                sb.append(parameters[i]);
                if (i < parameters.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
        }
        return sb.toString();
    }
}
