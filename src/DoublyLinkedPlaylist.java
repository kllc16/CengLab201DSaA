public class DoublyLinkedPlaylist {
    SONG head;
    SONG current;
    SONG tail;

    public void addSong(String title){
        SONG newSong = new SONG(title);
        if (head == null){
            head = tail = current = newSong;
            return;
        }
        tail.next = newSong;
        newSong.prev = tail;
        tail = newSong;
    }

}
