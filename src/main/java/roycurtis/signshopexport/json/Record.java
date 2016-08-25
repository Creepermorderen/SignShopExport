package roycurtis.signshopexport.json;

import org.bukkit.inventory.ItemStack;

/** Represents a JSON record for Gson serialization */
public class Record
{
    // Location
    public String locWorld;
    public int    locX;
    public int    locY;
    public int    locZ;

    // Owner
    public String ownerName;
    public String ownerUuid;

    // Sign data
    public String[] signText;
    public String   signType;
    public double   signPrice;

    // Inventory data
    public ItemStack[] invItems;
    public boolean     invInStock;
}