package symbolPackage;

import java.util.Comparator;
import java.util.HashMap;
import java.util.UUID;
import java.util.Vector;
import java.util.function.BiConsumer;

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

    public Vector<Pick> getSorted()
    {
        Vector<Pick> pickVector = new Vector<>();

        Add add = new Add(this, pickVector);

        this.nameId.forEach(add);

        pickVector.sort(new Compare());

        return pickVector;
    }

    class Compare implements Comparator<Pick>
    {
        @Override
        public int compare(Pick left, Pick right)
        {
            return left.toString().compareTo(right.toString());
        }
    }

    class Add implements BiConsumer<String, UUID>
    {
        Table table;
        Vector<Pick> pickVector;

        Add(Table table, Vector<Pick> pickVector)
        {
            this.table = table;
            this.pickVector = pickVector;
        }

        public void accept(String name, UUID id)
        {
            pickVector.add(new Pick(table,id, name));
        }
    }
}
