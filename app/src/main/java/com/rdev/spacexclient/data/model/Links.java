package com.rdev.spacexclient.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Links {

    @SerializedName("mission_patch_small")
    private Object missionPatchSmall;

    @SerializedName("mission_patch")
    private Object missionPatch;

    @SerializedName("video_link")
    private Object videoLink;

    @SerializedName("flickr_images")
    private List<Object> flickrImages;

    @SerializedName("reddit_recovery")
    private Object redditRecovery;

    @SerializedName("reddit_media")
    private Object redditMedia;

    @SerializedName("reddit_campaign")
    private String redditCampaign;

    @SerializedName("wikipedia")
    private Object wikipedia;

    @SerializedName("reddit_launch")
    private Object redditLaunch;

    @SerializedName("youtube_id")
    private Object youtubeId;

    @SerializedName("presskit")
    private Object presskit;

    @SerializedName("article_link")
    private Object articleLink;

    public void setMissionPatchSmall(Object missionPatchSmall) {
        this.missionPatchSmall = missionPatchSmall;
    }

    public Object getMissionPatchSmall() {
        return missionPatchSmall;
    }

    public void setMissionPatch(Object missionPatch) {
        this.missionPatch = missionPatch;
    }

    public Object getMissionPatch() {
        return missionPatch;
    }

    public void setVideoLink(Object videoLink) {
        this.videoLink = videoLink;
    }

    public Object getVideoLink() {
        return videoLink;
    }

    public void setFlickrImages(List<Object> flickrImages) {
        this.flickrImages = flickrImages;
    }

    public List<Object> getFlickrImages() {
        return flickrImages;
    }

    public void setRedditRecovery(Object redditRecovery) {
        this.redditRecovery = redditRecovery;
    }

    public Object getRedditRecovery() {
        return redditRecovery;
    }

    public void setRedditMedia(Object redditMedia) {
        this.redditMedia = redditMedia;
    }

    public Object getRedditMedia() {
        return redditMedia;
    }

    public void setRedditCampaign(String redditCampaign) {
        this.redditCampaign = redditCampaign;
    }

    public String getRedditCampaign() {
        return redditCampaign;
    }

    public void setWikipedia(Object wikipedia) {
        this.wikipedia = wikipedia;
    }

    public Object getWikipedia() {
        return wikipedia;
    }

    public void setRedditLaunch(Object redditLaunch) {
        this.redditLaunch = redditLaunch;
    }

    public Object getRedditLaunch() {
        return redditLaunch;
    }

    public void setYoutubeId(Object youtubeId) {
        this.youtubeId = youtubeId;
    }

    public Object getYoutubeId() {
        return youtubeId;
    }

    public void setPresskit(Object presskit) {
        this.presskit = presskit;
    }

    public Object getPresskit() {
        return presskit;
    }

    public void setArticleLink(Object articleLink) {
        this.articleLink = articleLink;
    }

    public Object getArticleLink() {
        return articleLink;
    }

    @Override
    public String toString() {
        return
                "Links{" +
                        "mission_patch_small = '" + missionPatchSmall + '\'' +
                        ",mission_patch = '" + missionPatch + '\'' +
                        ",video_link = '" + videoLink + '\'' +
                        ",flickr_images = '" + flickrImages + '\'' +
                        ",reddit_recovery = '" + redditRecovery + '\'' +
                        ",reddit_media = '" + redditMedia + '\'' +
                        ",reddit_campaign = '" + redditCampaign + '\'' +
                        ",wikipedia = '" + wikipedia + '\'' +
                        ",reddit_launch = '" + redditLaunch + '\'' +
                        ",youtube_id = '" + youtubeId + '\'' +
                        ",presskit = '" + presskit + '\'' +
                        ",article_link = '" + articleLink + '\'' +
                        "}";
    }
}