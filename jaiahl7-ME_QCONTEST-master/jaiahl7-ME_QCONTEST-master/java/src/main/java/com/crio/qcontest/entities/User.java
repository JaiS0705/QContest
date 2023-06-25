package com.crio.qcontest.entities;

class ScoreException extends RuntimeException{
    public ScoreException(String message){
        super(message);
    }
}

public class User implements Comparable<User> {
    private final String name;
    private Integer totalScore;
    private final Long id;
    private static Long autoInc;

    public User(String name, Long id) {
        this.name = name;
        this.id = id;
        this.totalScore = 100;
    }

    public User(String name) {
        this(name,autoInc);
    }
    

    public String getName() {
        return name;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public Long getId() {
        return id;
    }
    // TODO: CRIO_TASK_MODULE_ENTITIES
    // Complete the implementation of modifyScore method
    // Implementation must take care of the following cases:-
    // 1) Set an appropriate totalScore.
    // 2) Throw a Runtime Exception with an appropriate message for invalid score.

    public void modifyScore(Integer score) throws ScoreException {
        if(score<0)
        {
            throw new ScoreException("Invalid Exception");
        }
        this.totalScore = score;

    }

    public int compareTo(User u){
        return u.getTotalScore()-this.getTotalScore();
    }

    @Override
    public String toString() {
        return "User [id=" + id + "]";
    }  
}
