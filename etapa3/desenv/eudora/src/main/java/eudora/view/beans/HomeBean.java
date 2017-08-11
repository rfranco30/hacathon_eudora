package eudora.view.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.DateAxis;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

import com.ocpsoft.pretty.faces.annotation.URLMapping;

import eudora.model.Usuario;

@ManagedBean
@ViewScoped
@URLMapping(id = "home", pattern = "/home", viewId = "/pages/home/home.jsf")
public class HomeBean {

	private LineChartModel animatedModel1;
	private BarChartModel barModel;

	@PostConstruct
	public void init() {
		createAnimatedModels();
		createBarModels();
		Usuario u = new Usuario();

	}

	public BarChartModel getBarModel() {
		return barModel;
	}

	public LineChartModel getAnimatedModel1() {
		return animatedModel1;
	}

	private void createAnimatedModels() {
		animatedModel1 = initLinearModel();
		// animatedModel1.setTitle("Line Chart");
		animatedModel1.setAnimate(true);
		animatedModel1.setLegendPosition("se");
		Axis yAxis = animatedModel1.getAxis(AxisType.Y);
		// yAxis.setMin(0);
		// yAxis.setMax(10);

	}

	private LineChartModel initLinearModel() {
		LineChartModel model = new LineChartModel();

		LineChartSeries series1 = new LineChartSeries();
		series1.setLabel("Marcados");

		series1.set("2014-01-01", 20);
		series1.set("2014-01-02", 10);
		series1.set("2014-01-03", 30);
		series1.set("2014-01-04", 60);
		series1.set("2014-01-05", 30);

		LineChartSeries series2 = new LineChartSeries();
		series2.setLabel("Atendidos");

		series2.set("2014-01-01", 20);
		series2.set("2014-01-02", 10);
		series2.set("2014-01-03", 26);
		series2.set("2014-01-04", 55);
		series2.set("2014-01-05", 24);

		LineChartSeries series3 = new LineChartSeries();
		series3.setLabel("Cancelados");

		series3.set("2014-01-01", 0);
		series3.set("2014-01-02", 0);
		series3.set("2014-01-03", 4);
		series3.set("2014-01-04", 5);
		series3.set("2014-01-05", 6);
		model.addSeries(series1);
		model.addSeries(series2);
		model.addSeries(series3);

		model.setZoom(false);
		model.getAxis(AxisType.Y).setLabel("");
		DateAxis axis = new DateAxis("");
		// axis.setTickAngle(-50);
		axis.setMax("2014-01-06");
		axis.setTickFormat("%d/%m");

		model.getAxes().put(AxisType.X, axis);
		return model;
	}

	private BarChartModel initBarModel() {
		BarChartModel model = new BarChartModel();
		model.setAnimate(true);
		ChartSeries mar = new ChartSeries();
		mar.setLabel("Marcadas");
		mar.set("Novembro", 120);

		ChartSeries at = new ChartSeries();
		at.setLabel("Atendidas");
		at.set("Novembro", 52);

		ChartSeries can = new ChartSeries();
		can.setLabel("Canceladas");
		can.set("Novembro", 52);

		model.addSeries(mar);
		model.addSeries(at);
		model.addSeries(can);

		return model;
	}

	private void createBarModels() {
		createBarModel();

	}

	private void createBarModel() {
		barModel = initBarModel();

		barModel.setLegendPosition("ne");

	}

}
