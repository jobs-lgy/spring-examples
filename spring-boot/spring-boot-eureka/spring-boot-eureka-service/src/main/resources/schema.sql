CREATE TABLE IF NOT EXISTS task (
  id INT(11) NOT NULL AUTO_INCREMENT,
  task VARCHAR(32) NOT NULL,
  completed bit(1),
  PRIMARY KEY (id)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1;