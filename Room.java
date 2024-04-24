//Room.java
public class Room {
    private int roomId; 
    private String roomType; 
    private int capacity; 
    private boolean available; 
    public Room(int roomId, String roomType, int capacity) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.capacity = capacity;
        this.available = true;
    }
    public int getRoomId() {
        return roomId;
    }
    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
