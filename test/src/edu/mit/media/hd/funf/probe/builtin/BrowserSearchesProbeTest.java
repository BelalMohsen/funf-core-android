package edu.mit.media.hd.funf.probe.builtin;

import android.os.Bundle;
import edu.mit.media.hd.funf.probe.Probe;
import edu.mit.media.hd.funf.probe.Probe.SystemParameter;

public class BrowserSearchesProbeTest extends ProbeTestCase<BrowserSearchesProbe> {

	public BrowserSearchesProbeTest() {
		super(BrowserSearchesProbe.class);
	}

	public void testProbe() {
		Bundle params = new Bundle();
		params.putLong(SystemParameter.PERIOD.name, 0L);
		startProbe(params);
		Bundle data = getData(5);
		assertNotNull(data.get(Probe.TIMESTAMP));
		assertNotNull(data.get(BrowserSearchesProbe.SEARCHES));
	}
	
}