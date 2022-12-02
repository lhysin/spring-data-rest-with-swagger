package io.lhysin.data.rest.handler;

import org.springframework.data.rest.core.event.AbstractRepositoryEventListener;

import io.lhysin.data.rest.entitiy.Book;

public class MemberEventListener extends AbstractRepositoryEventListener<Book> {

  @Override
  public void onBeforeSave(Book book) {
    // ...
  }

  @Override
  public void onAfterDelete(Book book) {
    // ...
  }
}