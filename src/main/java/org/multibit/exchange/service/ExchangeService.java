package org.multibit.exchange.service;

import org.multibit.exchange.infrastructure.adaptor.eventapi.CurrencyPairDescriptor;
import org.multibit.exchange.infrastructure.adaptor.eventapi.ExchangeId;
import org.multibit.exchange.infrastructure.adaptor.eventapi.OrderDescriptor;
import org.multibit.exchange.infrastructure.adaptor.eventapi.OrderId;

/**
 * <p>Service to provide the following to the applications in the infrastructure layer:</p>
 * <ul>
 * <li>Core exchange services.</li>
 * </ul>
 *
 * @since 0.0.1
 *  
 */
public interface ExchangeService {

  void initializeExchange(ExchangeId identifier);

  void registerCurrencyPair(ExchangeId exchangeId, CurrencyPairDescriptor currencyPair);

  void placeOrder(ExchangeId exchangeId, OrderId orderId, OrderDescriptor order);
}
