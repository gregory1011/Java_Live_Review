package week11_inheritance.discord;

import java.time.LocalDate;

public class DiscordUser {

    String role, name;
    int id;
    LocalDate createdDate;


    public DiscordUser (String role, String name, int id){
        this.role = role;
        this.name = name;
        this.id = id;
        createdDate = LocalDate.now();
    }

    public void sendMessage (){
        System.out.println("Sending message to class chat");
    }

    public void joinDiscord ( String discordUrl){
        System.out.println("Joining "+ discordUrl);
    }

    public  String toString(){
        return name + " #"+ id + "\nRoles: "+role + "\nAccount created: "+ createdDate;
    }
}
