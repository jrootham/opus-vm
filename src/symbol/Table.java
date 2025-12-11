package symbol;

import java.util.HashMap;
import java.util.UUID;

public class Table
{
    HashMap<UUID, Symbol>   idMap;
    HashMap<String, UUID>   nameMap;

    public Table()
    {
        idMap = new HashMap<UUID, Symbol>();
        nameMap = new HashMap<String, UUID>();
    }

    public void add(Symbol symbol)
    {
        idMap.put(symbol.id, symbol);
        nameMap.put(symbol.getName(), symbol.getId());
    }


}
