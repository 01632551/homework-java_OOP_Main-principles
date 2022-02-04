package ru.netology.domain;

public class Place {
    // place description (if added), contain fields:

    private int id; // place ID (if available);
    private String title; // place title (if available);
    private int latitude; // geographical latitude;
    private int longitude; // geographical longitude;
    private int created; // date when the place has been created (if available);
    private String icon; // URL of icon image;
    private String country; // country name;
    private String city; // city name;

    // if place id added as a checkin, place object has additional fields:

    private int type; // checkin type;
    private int group_id; // community ID;
    private String group_photo; // URL of the community preview image;
    private int checkins; // checkins number;
    private int updated; // time of the last checkin in Unixtime;
    private int address; // address;
}
