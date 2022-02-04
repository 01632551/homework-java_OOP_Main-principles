package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private String postType; // Type of the post, can be: post, copy, reply, postpone, suggest.
    private int signerId; // author ID (if the post has been published by the community name with the author sign);
    private int canPin; // Shows if current user can pin a post (1 – yes, 0 – no).
    private int isPinned; // Shows if the post is pinned (1 – yes, 0 – no).
    private int markAsAds; // Information whether the post is marked as ads
    private boolean isFavorite; // true, if object is added to favorites by current users.
}
