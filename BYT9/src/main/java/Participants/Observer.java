package Participants;

import java.util.Date;

public interface Observer {
    void update(Date newLastModified);
    Date getLastModified();
}
