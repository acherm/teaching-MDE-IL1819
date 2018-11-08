import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import fr.istic.VideoGeneratorModel
import org.eclipse.emf.ecore.resource.Resource
import java.util.HashMap
import fr.istic.VideoGenStandaloneSetup

class VideoGenHelper {
	
	def loadVideoGenerator(URI uri) {
		VideoGenStandaloneSetup::doSetup
		var res = new ResourceSetImpl().getResource(uri, true);
		res.contents.get(0) as VideoGeneratorModel
	}

	def saveVideoGenerator(URI uri, VideoGeneratorModel videoGen) {
		var Resource rs = new ResourceSetImpl().createResource(uri);
		rs.getContents.add(videoGen);
		rs.save(new HashMap());
	}
	
	
}