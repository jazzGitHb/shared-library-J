def call(){
  def now = new Date()
  echo now.format("yyMMdd.HHmm", TimeZone.getTimeZone('UTC'))
  Calender cal = Calender.getInstance();
  day = now[cal.DAY_OF_WEEK]
  return day.toString()
}
