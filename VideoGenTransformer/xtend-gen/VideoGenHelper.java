import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class VideoGenHelper {
  public VideoGeneratorModel loadVideoGenerator(final URI uri) {
    throw new Error("Unresolved compilation problems:"
      + "\nVideoGeneratorModel cannot be resolved to a type."
      + "\nVideoGenStandaloneSetup cannot be resolved to a type."
      + "\ndoSetup cannot be resolved");
  }
  
  public void saveVideoGenerator(final URI uri, final /* VideoGeneratorModel */Object videoGen) {
    try {
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource rs = _resourceSetImpl.createResource(uri);
      EList<EObject> _contents = rs.getContents();
      _contents.add(videoGen);
      HashMap<Object, Object> _hashMap = new HashMap<Object, Object>();
      rs.save(_hashMap);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
