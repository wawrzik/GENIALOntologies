package mypackage;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.util.OWLOntologyMerger;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class synchronization {

    public static void main(String[] args) throws OWLOntologyCreationException, IOException {
        System.out.print("Hello");
        final OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        final OWLOntology gbo = manager.loadOntologyFromOntologyDocument(new File("/Users/Frank/local/git/GENIALOntologies/OntologyModuleSuite/GENIAL! Basic Ontology/GENIALOntBFO.owl"));
        final OWLOntology roadmap = manager.loadOntologyFromOntologyDocument(new File("/Users/Frank/local/git/GENIALOntologies/OntologyModuleSuite/Roadmap Ontologies/roadmapexample.owl"));System.out.println("Loaded " + gbo.getOntologyID());
        //Set<OWLClass> classes = gbo.getClassesInSignature();
        final OWLOntologyMerger merger 

        //final OWLOntology ontology = manager.loadOntologyFromOntologyDocument(new File("/Users/Frank/local/test.owl"));
        //File f = new File("/Benutzer/Frank/Downloads/test.owl");
        //f.createNewFile();
    }
}
