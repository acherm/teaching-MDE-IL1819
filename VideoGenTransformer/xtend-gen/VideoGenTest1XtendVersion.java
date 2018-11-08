import fr.istic.videoGen.VideoGenInformation;
import fr.istic.videoGen.VideoGeneratorModel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class VideoGenTest1XtendVersion {
  @Test
  public void testLoadModel() {
    VideoGenHelper _videoGenHelper = new VideoGenHelper();
    URI _createURI = URI.createURI("example1.videogen");
    final VideoGeneratorModel videoGen = _videoGenHelper.loadVideoGenerator(_createURI);
    Assert.assertNotNull(videoGen);
    VideoGenInformation _information = videoGen.getInformation();
    String _authorName = _information.getAuthorName();
    InputOutput.<String>println(_authorName);
  }
}
