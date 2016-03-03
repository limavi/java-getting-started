import java.util.*;

import static spark.Spark.*;
import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import static spark.Spark.get;

public class Main {

  public static void main(String[] args) {

    port(Integer.valueOf(System.getenv("PORT")));
    staticFileLocation("/public");

    get("/taller3", (request, response) -> {

      ArrayList<Double> listActualAddedModifiedSize = (ArrayList) ManejadorArchivo.retornarContenidoArchivoDouble("src/main/resources/public/ActualAddedModifiedSize.txt");
      ArrayList<Double> listEstimatedProxySize = (ArrayList) ManejadorArchivo.retornarContenidoArchivoDouble("src/main/resources/public/EstimatedProxySize.txt");
      ArrayList<Double> listPlanAddedModifiedSize = (ArrayList) ManejadorArchivo.retornarContenidoArchivoDouble("src/main/resources/public/PlanAddedModifiedSize.txt");
      ArrayList<Double> listActualDevelopmentHour =  (ArrayList) ManejadorArchivo.retornarContenidoArchivoDouble("src/main/resources/public/ActualDevelopmentHour.txt");

      Map<String, Object> attributes = new HashMap<>();
      attributes.put("listActualAddedModifiedSize", listActualAddedModifiedSize);
      attributes.put("listEstimatedProxySize", listEstimatedProxySize);
      attributes.put("listPlanAddedModifiedSize", listPlanAddedModifiedSize);
      attributes.put("listActualDevelopmentHour", listActualDevelopmentHour);
      attributes.put("test1", Tarea.ejecutarTest("listEstimatedProxySize - listActualAddedModifiedSize: ",listEstimatedProxySize, listActualAddedModifiedSize ));
      attributes.put("test2", Tarea.ejecutarTest("listEstimatedProxySize - listActualDevelopmentHour: ",listEstimatedProxySize, listActualDevelopmentHour ));
      attributes.put("test3", Tarea.ejecutarTest("listPlanAddedModifiedSize - listActualAddedModifiedSize: ",listPlanAddedModifiedSize, listActualAddedModifiedSize ));
      attributes.put("test4", Tarea.ejecutarTest("listPlanAddedModifiedSize - listActualDevelopmentHour: ",listPlanAddedModifiedSize, listActualDevelopmentHour ));

      return new ModelAndView(attributes, "taller3.ftl");
    }, new FreeMarkerEngine());

    get("/", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Hello World!");

            return new ModelAndView(attributes, "index.ftl");
        }, new FreeMarkerEngine());

  }

}
