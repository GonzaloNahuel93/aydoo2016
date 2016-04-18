package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class OrdenadorDeParametrosTest {

	@Test
	public void seQuiereOrdenarUnArrayDeParametrosYaOrdenadosAcordeALaConvencion(){

		String[] parametros = new String[4];
		parametros[0] = "1";
		parametros[1] = "--format=pretty";
		parametros[2] = "--sort:des";
		parametros[3] = "--output-file=archivo.txt";

		OrdenadorDeParametros ordenadorParametrico = new OrdenadorDeParametros();
		String[] parametrosOrdenados = ordenadorParametrico.ordenar(parametros);

		Assert.assertTrue("1".equals(parametrosOrdenados[0]));
		Assert.assertTrue("--format=pretty".equals(parametrosOrdenados[1]));
		Assert.assertTrue("--sort:des".equals(parametrosOrdenados[2]));
		Assert.assertTrue("archivo.txt".equals(parametrosOrdenados[3]));

	}

	@Test
	public void seOrdenaUnArrayDeParametrosOrdenadosDeFormaInversaALaConvencion(){

		String[] parametros = new String[4];
		parametros[0] = "1";
		parametros[1] = "--output-file=archivo.txt";
		parametros[2] = "--sort:asc";
		parametros[3] = "--format=quiet";

		OrdenadorDeParametros ordenadorParametrico = new OrdenadorDeParametros();
		String[] parametrosOrdenados = ordenadorParametrico.ordenar(parametros);

		Assert.assertTrue("1".equals(parametrosOrdenados[0]));
		Assert.assertTrue("--format=quiet".equals(parametrosOrdenados[1]));
		Assert.assertTrue("--sort:asc".equals(parametrosOrdenados[2]));
		Assert.assertTrue("archivo.txt".equals(parametrosOrdenados[3]));

	}

	@Test
	public void seOrdenaUnArrayDeParametrosDesordenadosAleatoriamenteAcordeALaConvencion(){

		String[] parametros = new String[4];
		parametros[0] = "1";
		parametros[1] = "--format=pretty";
		parametros[2] = "--output-file=archivo.txt";
		parametros[3] = "--sort:des";

		OrdenadorDeParametros ordenadorParametrico = new OrdenadorDeParametros();
		String[] parametrosOrdenados = ordenadorParametrico.ordenar(parametros);

		Assert.assertTrue("1".equals(parametrosOrdenados[0]));
		Assert.assertTrue("--format=pretty".equals(parametrosOrdenados[1]));
		Assert.assertTrue("--sort:des".equals(parametrosOrdenados[2]));
		Assert.assertTrue("archivo.txt".equals(parametrosOrdenados[3]));

	}

	@Test
	public void seOrdenaUnArrayDeParametrosOrdenadosDeFormaInversaALaConvencionPeroEscritosConMayusculasYMinusculas(){

		String[] parametros = new String[4];
		parametros[0] = "1";
		parametros[1] = "--SorT:ASC";
		parametros[2] = "--FORMaT=Quiet";
		parametros[3] = "--OUTPUT-FILE=ArChIvO.txt";

		OrdenadorDeParametros ordenadorParametrico = new OrdenadorDeParametros();
		String[] parametrosOrdenados = ordenadorParametrico.ordenar(parametros);

		Assert.assertTrue("1".equals(parametrosOrdenados[0]));
		Assert.assertTrue("--format=quiet".equals(parametrosOrdenados[1]));
		Assert.assertTrue("--sort:asc".equals(parametrosOrdenados[2]));
		Assert.assertTrue("archivo.txt".equals(parametrosOrdenados[3]));

	}

	@Test
	public void seOrdenaUnArrayDeParametrosDesordenadosAcordeALaConvencionDondeNoNecesariamenteSeanParametrosValidos(){

		String[] parametros = new String[4];
		parametros[0] = "1";
		parametros[1] = "--output-file=archivo.txt";
		parametros[2] = "--sort:arcoiris";
		parametros[3] = "--format=a4";

		OrdenadorDeParametros ordenadorParametrico = new OrdenadorDeParametros();
		String[] parametrosOrdenados = ordenadorParametrico.ordenar(parametros);

		Assert.assertTrue("1".equals(parametrosOrdenados[0]));
		Assert.assertTrue("--format=a4".equals(parametrosOrdenados[1]));
		Assert.assertTrue("--sort:arcoiris".equals(parametrosOrdenados[2]));
		Assert.assertTrue("archivo.txt".equals(parametrosOrdenados[3]));

	}

	@Test
	public void seOrdenaUnArrayDeParametrosDesordenadosAcordeALaConvencionDondeHayParametrosQueSonPalabrasSueltasYNoSignificanNada(){

		String[] parametros = new String[4];
		parametros[0] = "1";
		parametros[1] = "--output-file=archivo.txt";
		parametros[2] = "AyDE";
		parametros[3] = "AyDOO";

		OrdenadorDeParametros ordenadorParametrico = new OrdenadorDeParametros();
		String[] parametrosOrdenados = ordenadorParametrico.ordenar(parametros);

		Assert.assertTrue("1".equals(parametrosOrdenados[0]));
		Assert.assertTrue(" ".equals(parametrosOrdenados[1]));
		Assert.assertTrue(" ".equals(parametrosOrdenados[2]));
		Assert.assertTrue("archivo.txt".equals(parametrosOrdenados[3]));

	}

}