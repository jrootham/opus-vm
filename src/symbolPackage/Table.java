package symbolPackage;

import java.util.HashMap;
import java.util.UUID;

public class Table
{
    HashMap<UUID, String>  idName;
    HashMap<String, UUID> nameId;

    public Table()
    {
        idName = new HashMap<UUID, String>();
        nameId = new HashMap<String, UUID>();
    }

    public boolean insert(UUID id, String name)
    {
        boolean result;

        if (nameId.containsKey(name))
        {
            result = false;
        }
        else
        {
            idName.put(id, name);
            nameId.put(name, id);
            result = true;
        }

        return result;
    }

    public boolean rename(UUID id, String newName)
    {
        boolean result;

        if (this.nameId.containsKey(newName))
        {
            result = false;
        }
        else
        {
            if (this.idName.containsKey(id))
            {
                String oldName = this.idName.get(id);
                this.idName.replace(id, newName);
                this.nameId.remove(oldName);
                this.nameId.put(newName, id);

                result = true;
            }
            else
            {
                result = false;
            }
        }

        return result;
    }

    public String getName(UUID id)
    {
        return this.idName.get(id);
    }
}
