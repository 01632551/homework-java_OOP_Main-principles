package ru.netology.domain;

public class PostSource {
    private String type;
    /* Source type. Possible values:
        vk — web (https://vk.com/);
        widget — widget on an external site;
        api — via VK API;
        rss— via RSS feed import;
        sms — via SMS.*/
    private String platform;
    /*Platform (if available). Possible values:
        android;
        iphone;
        wphone.*/
    private String data;
    /*Action type (only for type = vk or widget). Possible values:
        profile_activity — status changing (for type = vk);
        profile_photo — profile photo changing (for type = vk);
        comments — Comments widget (for type = widget);
        like — Like widget (for type = widget);
        poll — Poll widget (for type = widget);*/
    private String url; // Source URL
}
