package ru.netology.domain;

public class Likes {
    private int count; // likes count
    private int userLikes; // whether the user liked the post (0 - not liked, 1 - liked)
    private int canLike; // Whether the user can like the post (0 — cannot, 1 — can).
    private int canPublish; // Whether the user can repost (0 — cannot, 1 — can).
}
