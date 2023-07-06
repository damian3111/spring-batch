package com.damian3111.SpringBatch.listener;

import com.damian3111.SpringBatch.entity.Customer;
import lombok.extern.log4j.Log4j2;
import org.springframework.batch.core.SkipListener;

@Log4j2
public class BatchListener implements SkipListener<Customer, Number> {
    @Override
    public void onSkipInRead(Throwable t) {
        log.info("onSkipInRead: {}", t.getMessage());
        SkipListener.super.onSkipInRead(t);
    }

    @Override
    public void onSkipInWrite(Number item, Throwable t) {
        log.info("onSkipInWrite: {}", t.getMessage());
        SkipListener.super.onSkipInWrite(item, t);
    }

    @Override
    public void onSkipInProcess(Customer item, Throwable t) {
        log.info("onSkipInProcess: {}", t.getMessage());
        SkipListener.super.onSkipInProcess(item, t);
    }
}
