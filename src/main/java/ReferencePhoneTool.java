import java.util.ArrayList;

public class ReferencePhoneTool {
    private ArrayList<Participant> participantsList = new ArrayList<>();
    private class Participant {
        String surname;
        String phoneNumber;

        public Participant(String surname, String phoneNumber) {
            this.surname = surname;
            this.phoneNumber = phoneNumber;
        }

        public String getSurname() {
            return surname;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String participantToString() {
            return surname + ":" + phoneNumber;
        }
    }

    public ArrayList<Participant> getParticipantsList() {
        return participantsList;
    }

    public void add(String surname, String phoneNumber) {
        this.participantsList.add(new Participant(surname, phoneNumber));
    }

    public ArrayList<String> get(String surname) {
        ArrayList<String> phoneListBySurname = new ArrayList<>();
        for (Participant item: this.participantsList) {
            if (item.getSurname().equalsIgnoreCase(surname)) {
                phoneListBySurname.add(item.getPhoneNumber());
            }
        }
        return phoneListBySurname;
    }
}
