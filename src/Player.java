public class Player {

    private String name;
    private Symbol symbol;
    private String pId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public Player(String name, Symbol symbol, String pId) {
        this.name = name;
        this.symbol = symbol;
        this.pId = pId;
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", symbol=" + symbol + "]";
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

}
