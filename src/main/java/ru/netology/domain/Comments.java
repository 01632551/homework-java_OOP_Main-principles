package ru.netology.domain;

public class Comments {
    private int count; // comments count
    private int canPost; // shows if current user can comment the post (1 - yes, 0 - no)
    private int groupsCanPost; // information whether communities can comment this post
}
