package com.github.cloudyrock.mongock.driver.mongodb.springdata.v3.decorator.operation.executable.aggregation.impl;

import com.github.cloudyrock.mongock.driver.mongodb.springdata.v3.decorator.operation.executable.aggregation.TerminatingAggregationDecorator;
import io.changock.driver.api.lock.guard.decorator.DecoratorBase;
import io.changock.driver.api.lock.guard.invoker.LockGuardInvoker;
import org.springframework.data.mongodb.core.ExecutableAggregationOperation;

public class TerminatingAggregationDecoratorImpl<T>
    extends DecoratorBase<ExecutableAggregationOperation.TerminatingAggregation<T>>
    implements TerminatingAggregationDecorator<T> {
  public TerminatingAggregationDecoratorImpl(ExecutableAggregationOperation.TerminatingAggregation<T> impl, LockGuardInvoker invoker) {
    super(impl, invoker);
  }
}
