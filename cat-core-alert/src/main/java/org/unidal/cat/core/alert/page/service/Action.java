package org.unidal.cat.core.alert.page.service;

public enum Action implements org.unidal.web.mvc.Action {
   TEXT("text"),

   BINARY("binary");

   private String m_name;

   private Action(String name) {
      m_name = name;
   }

   public static Action getByName(String name, Action defaultAction) {
      for (Action action : Action.values()) {
         if (action.getName().equals(name)) {
            return action;
         }
      }

      return defaultAction;
   }

   @Override
   public String getName() {
      return m_name;
   }
}
