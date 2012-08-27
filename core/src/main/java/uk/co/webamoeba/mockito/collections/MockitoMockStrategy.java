package uk.co.webamoeba.mockito.collections;

import static org.mockito.Mockito.mock;

/**
 * {@link MockStrategy} that creates Mockito style mocks.
 * 
 * @author James Kennard
 */
public class MockitoMockStrategy implements MockStrategy {

	public <T> T createMock(Class<T> clazz) {
		return mock(clazz);
	}

}