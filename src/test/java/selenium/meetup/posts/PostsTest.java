package selenium.meetup.posts;

import org.junit.Test;
import selenium.meetup.BaseTest;
import selenium.meetup.pages.IndexPage;
import selenium.meetup.pages.NewPostPage;
import selenium.meetup.pages.PostsPage;

/**
 * Created by ddavison on 12/2/14.
 */
public class PostsTest extends BaseTest{
    @Test
    public void testNewPost() {
        click(IndexPage.LNK_VIEWALLPOSTS)
        .click(PostsPage.LNK_NEWPOST)
        .setText(NewPostPage.TXT_TITLE, "Test");
        // continue
    }

    @Test
    public void testEditPost() {

    }

    @Test
    public void testDeletePost() {

    }
}
