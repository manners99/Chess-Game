public class Main {

    public enum Colour {
        WHITE,
        BLACK;
    }

    public enum Location {
        A1, A2, A3, A4, A5, A6, A7, A8,
        B1, B2, B3, B4, B5, B6, B7, B8,
        C1, C2, C3, C4, C5, C6, C7, C8,
        D1, D2, D3, D4, D5, D6, D7, D8,
        E1, E2, E3, E4, E5, E6, E7, E8,
        F1, F2, F3, F4, F5, F6, F7, F8,
        G1, G2, G3, G4, G5, G6, G7, G8,
        H1, H2, H3, H4, H5, H6, H7, H8;
    }

    public enum Command {
        NEW_GAME(0, "Start a new game"),
        MOVE(2, "Move you piece <LOCATION_FROM> <LOCATION_TO>"),
        SAVE_GAME(0, "Save the current game"),
        RESIGN(1, "Resign <COLOUR_RESIGNING>"),
        DRAW(0, "Propose a draw to your opponent"),
        EXIT(0, "Exit the terminal");



        private final String message;
        private final int numArgs;
        private final String[] prompts;

        private Command(final int numArgs, final String message) {
            //use the priincipal of constuctor chaining to call the other constructor
            this(numArgs, message, new String[] {});// use a empty string array for the missing variables
        }

        private Command(final int numArgs, final String message, final String[] prompts) {
            this.numArgs = numArgs;
            this.message = message;
            this.prompts = prompts;
        }

        public boolean hasArgs() {
            return this.numArgs > 0;
        }

        public int getNumArgs() {
            return this.numArgs;
        }

        public boolean hasPrompts() {
            return this.prompts.length > 0;
        }

        public int getNumPrompts() {
            return this.prompts.length;
        }

        public String getPrompts(int index) {
            return this.prompts[index];
        }
    }

    private static final String COMMAND_PREFIX = "Chess> ";

    public Main(Object chess) {
    }

    public static void main(String[] args) {
        new Main(new Chess()).run();
    }

    private void run() {
    }

    private static void printBanner() {
        // https://patorjk.com/software/taag/
        // Font: Blocks
        // https://www.freeformatter.com/java-dotnet-escape.html#before-output
        System.out.println(" .----------------.  .----------------.  .----------------.  .----------------.  .----------------. "
        + "\r\n| .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |\r\n| "
        + "|     ______   | || |  ____  ____  | || |  _________   | || |    _______   | || |    _______   | |\r\n| |   .' ___  |  | |"
        + "| | |_   ||   _| | || | |_   ___  |  | || |   /  ___  |  | || |   /  ___  |  | |\r\n| |  / .'   \\_|  | || |   | |__| |   | |"
        + "| |   | |_  \\_|  | || |  |  (__ \\_|  | || |  |  (__ \\_|  | |\r\n| |  | |         | || |   |  __  |   | || |   |  _|  _   | "
        + "|| |   '.___`-.   | || |   '.___`-.   | |\r\n| |  \\ `.___.'\\  | || |  _| |  | |_  | || |  _| |___/ |  | || |  |`\\____) |  | "
        + "|| |  |`\\____) |  | |\r\n| |   `._____.'  | || | |____||____| | || | |_________|  | || |  |_______.'  | || |  |_______.'  | |\r"
        + "\n| |              | || |              | || |              | || |              | || |              | |\r\n| '--------------' ||"
        + " '--------------' || '--------------' || '--------------' || '--------------' |\r\n '----------------'  '----------------'  "
        + "'----------------'  '----------------'  '----------------' ");
    }
    
}
