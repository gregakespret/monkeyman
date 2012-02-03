package nl.flotsam.frontman.decorator

import nl.flotsam.frontman.Resource

class ResourceDecoration(resource: Resource) extends Resource {

  def label = resource.label

  def pubDate = resource.pubDate

  def contentType = resource.contentType

  def open = resource.open

  def path = resource.path

  def tags = resource.tags

}