/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ARUL
 */
public class Feedback {
    private String feedemail, feedfirst, feedlast, feedback;
    private int feedid;

    /**
     * @return the feedemail
     */
    public String getFeedemail() {
        return feedemail;
    }

    /**
     * @param feedemail the feedemail to set
     */
    public void setFeedemail(String feedemail) {
        this.feedemail = feedemail;
    }

    /**
     * @return the feedfirst
     */
    public String getFeedfirst() {
        return feedfirst;
    }

    /**
     * @param feedfirst the feedfirst to set
     */
    public void setFeedfirst(String feedfirst) {
        this.feedfirst = feedfirst;
    }

    /**
     * @return the feedlast
     */
    public String getFeedlast() {
        return feedlast;
    }

    /**
     * @param feedlast the feedlast to set
     */
    public void setFeedlast(String feedlast) {
        this.feedlast = feedlast;
    }

    /**
     * @return the feedback
     */
    public String getFeedback() {
        return feedback;
    }

    /**
     * @param feedback the feedback to set
     */
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    /**
     * @return the feedid
     */
    public int getFeedid() {
        return feedid;
    }

    /**
     * @param feedid the feedid to set
     */
    public void setFeedid(int feedid) {
        this.feedid = feedid;
    }
}
